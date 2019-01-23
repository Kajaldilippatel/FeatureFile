package ComNopCommerce;


import org.openqa.selenium.By;

public class HomePagaLinks extends ValidateHomePage {

    By computer=By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a");
    By electronics=By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    By apparel=By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a");
    By digitalDownloads=By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a");
    By books=By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a");
    By jewelry=By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a");
    By giftCards=By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a");
    public void homePageLinks() {
        String str="https://demo.nopcommerce.com/";
      clickElement(computer);
      validateHomePage(str+"computers");
      clickElement(electronics);
      validateHomePage(str+"electronics");
      clickElement(apparel);
      validateHomePage(str+"apparel");
      clickElement(digitalDownloads);
      validateHomePage(str+"digital-downloads");
      clickElement(books);
      validateHomePage(str+"books");
      clickElement(jewelry);
      validateHomePage(str+"jewelry");
      clickElement(giftCards);
      validateHomePage(str+"gift-cards");

    }

}
