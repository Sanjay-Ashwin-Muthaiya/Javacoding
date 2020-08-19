main_url = "http://books.toscrape.com/index.html"

import requests
result = requests.get(main_url)

result.text[:1000]
from bs4 import BeautifulSoup
soup = BeautifulSoup(result.text, 'html.parser')

print(soup.prettify()[:1000])
def getAndParseURL(url):
    result = requests.get(url)
    soup = BeautifulSoup(result.text, 'html.parser')
    return(soup)
soup.find("article", class_ = "product_pod")

soup.find("article", class_ = "product_pod").div.a
soup.find("article", class_ = "product_pod").div.a.get('href')
main_page_products_urls = [x.div.a.get('href') for x in soup.findAll("article", class_ = "product_pod")]

print(str(len(main_page_products_urls)) + " fetched products URLs")
print("One example:")
main_page_products_urls[0]
def getBooksURLs(url):
    soup = getAndParseURL(url)
    # remove the index.html part of the base url before returning the results
    return(["/".join(url.split("/")[:-1]) + "/" + x.div.a.get('href') for x in soup.findAll("article", class_ = "product_pod")])

import re

categories_urls = [main_url + x.get('href') for x in soup.find_all("a", href=re.compile("catalogue/category/books"))]
categories_urls = categories_urls[1:] # we remove the first one because it corresponds to all the books

print(str(len(categories_urls)) + " fetched categories URLs")
print("Some examples:")
categories_urls[:5]
pages_urls = [main_url]

soup = getAndParseURL(pages_urls[0])

while len(soup.findAll("a", href=re.compile("page"))) == 2 or len(pages_urls) == 1:
    
    
    new_url = "/".join(pages_urls[-1].split("/")[:-1]) + "/" + soup.findAll("a", href=re.compile("page"))[-1].get("href")
    
    pages_urls.append(new_url)
    
 
    soup = getAndParseURL(new_url)
    

print(str(len(pages_urls)) + " fetched URLs")
print("Some examples:")
pages_urls[:5]

pages_urls = []

new_page = "http://books.toscrape.com/catalogue/page-1.html"
while requests.get(new_page).status_code == 200:
    pages_urls.append(new_page)
    new_page = pages_urls[-1].split("-")[0] + "-" + str(int(pages_urls[-1].split("-")[1].split(".")[0]) + 1) + ".html"
    

print(str(len(pages_urls)) + " fetched URLs")
print("Some examples:")
pages_urls[:5]

booksURLs = []
for page in pages_urls:
    booksURLs.extend(getBooksURLs(page))
    
print(str(len(booksURLs)) + " fetched URLs")
print("Some examples:")
booksURLs[:5]

names = []
prices = []
nb_in_stock = []
img_urls = []
categories = []
ratings = []

for url in booksURLs:
    soup = getAndParseURL(url)
   
    names.append(soup.find("div", class_ = re.compile("product_main")).h1.text)
    
    prices.append(soup.find("p", class_ = "price_color").text[2:]) # get rid of the pound sign
   
    nb_in_stock.append(re.sub("[^0-9]", "", soup.find("p", class_ = "instock availability").text)) # get rid of non numerical characters
   
    img_urls.append(url.replace("index.html", "") + soup.find("img").get("src"))
    
    categories.append(soup.find("a", href = re.compile("../category/books/")).get("href").split("/")[3])
   
    ratings.append(soup.find("p", class_ = re.compile("star-rating")).get("class")[1])
    

import pandas as pd

scraped_data = pd.DataFrame({'name': names, 'price': prices, 'nb_in_stock': nb_in_stock, "url_img": img_urls, "product_category": categories, "rating": ratings})
scraped_data.head()