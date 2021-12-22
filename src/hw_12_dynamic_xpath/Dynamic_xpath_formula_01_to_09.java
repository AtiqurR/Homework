package hw_12_dynamic_xpath;

public class Dynamic_xpath_formula_01_to_09 {

	/*
	 
	 
	1. Tag with a single attribute.

       Source: https://www.bestbuy.com/
       Example: 
       
           i) search field ---> //input[@id='gh-search-input']
           ii) submit button ---> //span[@class='header-search-icon']
           iii) logo ---> //img[@class='logo']
           iv) Best Buy Totaltech(XPath) ---> (//a[@class='bottom-left-links '])[3]
           v) 24-Hour Flash Sale ---> //h2[@class='headline56 v-fw-bold v-m-top-xxs']


     2. Tag with multiple attribute with 'or' logic 
      
       Source: https://www.staples.com/
       Example:

            i) search field ---> //input[@id='searchInput' or @class='search-bar-input__searchBar']
            ii) norton ---> //h1[@id='searchTerm' or @class='searchQuery-UX2__searchQueryText']
            iii) FEATURED PRODUCTS ---> //h2[@id='carousel_FEATURED_PRODUCTS' or @class='carousel__title']
            iv) Trending Now ---> //h2[@id='carousel_Trending_Now' or @class='carousel__title']
            v) ImageStaple ---> //img[@class='section-three__mainlogo' or @link='https://assets.staples-static.com/sbd/cre/products/190317/dg19214/images/staples_logo_transparent.svg']


      3) Tag with multiple attribute with 'and' logic 
        
        Source: https://www.costco.com/
        Example:

            i) Search feild ---> //input[@id='search-field' and @class='form-control typeahead cstm-margn tt-input']
            ii) Orders & Returns ---> //a[@id='header_order_and_returns' and @class='myaccount']
            iii) Reorder ---> //a[@id='miniBannerReorder' and @class='body-copy-link']
            iv) Holiday Gifts for Everyone ---> //h2[@id='target-espot-hdr' and @style='text-align: center !important; display: flow-root']
            v) $1,299.99 --- > //div[@id='price-1588492' and @class='price']


      4) Tag with inner text [means complete text] 

        Source: https://www.target.com/
        Example:
           
           i) Categories ---> //span[text()='Categories']
           ii) Get gifts today with same-day pickup & delivery ---> (//span[text()='Get gifts today with same-day pickup & delivery'])[1]
           iii) Deal of the Day ---> //span[text()='Deal of the Day '] 
           iv) About Target ---> //h3[text()='About Target']
           v) Stores --- //h3[text()='Stores']

      5) Tag with inner text [not actual text, means partial text as well as actual text] 
       
         Source: https://www.hbo.com/
         Example:
        
           i) House of the Dragon ---> //strong[contains(text(), 'House of the Dragon')]   (Complete Text)
           ii) House of the Dragon ---> //strong[contains(text(), 'Ho')]   (Partial Text)
           iii) HOW TO WATCH HBO MAX ---> //a[contains(text(), 'HOW TO WATCH HBO MAX')]    (Complete Text)
           iv) HOW TO WATCH HBO MAX ---> //a[contains(text(), 'HOW')]      (Partial Text)
           v) Succession ---> //strong[contains(text(), 'Su')]       (Partial Text)


      6) Tag with attributes and use of contains 

         Source: https://www.bankofamerica.com/
         Example:

           i) Personal ---> //a[contains(@class, 'selected')]
           ii) Online ID ---> //input[contains(@name, 'onlineId1')]
           iii) Your news and information ---> //h2[contains(@class, 'heading cnx-regular')]
           iv) Security ---> //a[contains(@id, 'NAV_SECURITY')]
           v) Connect with us ---> //h2[contains(@class, 'boa-social--header')]


       7) Normalize space -- eliminates leading and trailing spaces.

         Source: https://www.costco.com/
         Example: 
           
           i) Find a Warehouse ---> //a[normalize-space(text())='Find a Warehouse' and @class='header-menu-dropdown']
           ii)Get Email Offers ---> //a[normalize-space(text())='Get Email Offers' and @id='email-signup-link']
           iii) Orders & Returns ---> //a[normalize-space(text())='Orders & Returns']
           iv) Samsung Tablets & Wearables ---> //h2[normalize-space(text())='Samsung Tablets & Wearables']
           v) Customer Service ---> (//div[normalize-space(text())='Customer Service'])[1]


       8) Starts with text

          Source: https://www.texas.gov/
          Example: 
          
            i) Copyright © ---> //p[starts-with(text(), 'Copyright ©')]
            ii) //p[starts-with(text(), 'Explore our handy guide for what you need to know, from finding a new home to replacing a driver license.')]
            iii) Texas.gov is the official website ---> (//p[starts-with(text(), 'T')])[1]
            iv) Texas government agencies offer a range of ---> //span[starts-with(text(), 'Texas g')]
            v) Texas offers a variety of resources to help you ---> //span[starts-with(text(), 'Texas offers')]


       9) Starts with attribute 
          
          Source: https://www.nyp.org/
          Example:
           
            i) e.g. Allergy and Immunology ---> (//input[starts-with(@class, 'c')])[1]
            ii) Visiting NewYork-Presbyterian? ---> //p[starts-with(@class, 'text-align-center c-quick-link--gallery__body')]
            iii) image ---> (//img[starts-with(@class, 'coh-image coh-image-responsive-xl')])[1]
            iv) Virtual Urgent Care ---> (//h3[starts-with(@class, 'coh-heading nyp-type-h2 u-m-t-0')])[2]
            v) Enter email address ---> //input[starts-with(@class, 'c-input') and @placeholder='Enter email address']



	 * 
	 */
}
