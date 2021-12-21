package hw_13;

public class Dynamic_xpath__formula_10_to_14 {
	
	
/*

10) Tag with parents 

Source: https://www.verizon.com/
Examples:

i) Personal ---> //a[@id='gnav20-eyebrow-link-Personal']//parent::div[@class='gnav20-eyebrow-link-list-item gnav20-two']

ii) 2021 ---> //span[@id='copyright-year']//parent::div[@class='copyright-text']

iii) Verizon Logo ---> //img[@alt='Verizon Logo']//parent::a[@class='gnav20-logoBlackBg']

iv) Accessories ---> //a[@id='tab-3']//parent::li[@class='Tab']

v) Español ---> (//a[@class='gnav20-lang-link gnav20-subanchor']//parent::div[@class='gnav20-utility-wrapper '])[1]


11) Tag with child

Source: https://www.ebay.com/
Examples: 

i) Watchlist ---> //li[@id='gh-wl-click']//child::div[@class='gh-menu gh--link__divider']
ii) Search ---> //td[@class='gh-td gh-sch-btn']//child::input[@class='btn btn-prim gh-spr']
iii) Buy ---> (//h3[@class='gf-bttl']//child::a[@class='gf-bttl thrd'])[1]
iv) Tools & apps ---> (//li[@class='gf-li']//child::h3[@class='gf-bttl'])[3]
v) sign-in ---> //button[@class='gh-control ghn-b gh-eb-li-a']//child::i[@id='gh-Alerts-i']


12)Tag with following sibling {younger brother}

Source: https://www.amazon.com/
Examples: 

i) Amazon logo ---> //span[@class='nav-sprite nav-logo-base']//following-sibling::span[@id='logo-ext']
ii) Keep shopping for ---> (//span[@class='a-truncate-full a-offscreen']//following-sibling::span[@class='a-truncate-cut'])[1]
iii) Amazon Devices ---> (//li[@class='nav_first']//following-sibling::li[@class='nav_last '])[1]
iv) Keep shopping for ---> (//span[@class='a-truncate-full a-offscreen']//following-sibling::span[@class='a-truncate-cut'])[1]
v) Home & beauty (Deals on most-loved gifts)


13) Tag with preceding sibling {elder brother} 

Source: https://www.netflix.com/
Example:

i) Save your favorites easily and always have something to watch.---> (//h2[@class='our-story-card-subtitle']//preceding-sibling::h1[@class='our-story-card-title'])[3]
ii) Questions? ---> //ul[@class='footer-links structural']//preceding-sibling::p[@class='footer-top']
iii) What is Netflix? ---> (//div[@class='faq-answer closed']//preceding-sibling::button[@class='faq-question'])[1]
iv) Get Started ---> (//span[@class='chevron-right-arrow']//preceding-sibling::span[@class='cta-btn-txt'])[1]
v) How do I cancel? ---> (//div[@class='faq-answer closed']//preceding-sibling::button[@class='faq-question'])[4]


14) Tag with inner text/attribute (if multiple is present) [Last choice]

Source: https://www.discovery.com/
Example:

i) LIVE NOW ---> //h6[normalize-space(text())='Live Now']
ii) EXPLORATION ---> (//span[normalize-space(text())='EXPLORATION'])[2]
iii) Catch Up --->//span[normalize-space(text())='Catch Up']
iv) Why Do Ducks Swim in a Row? ---> //span[normalize-space(text())='Why Do Ducks Swim in a Row?']
v) Here for the Holidays ---> //span[normalize-space(text())='Here for the Holidays']


*/

}
