package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;

public class UserTest {
@Test
   public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("src/bean1.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.help();
    }

    @Test
    public void bookTest(){
    ApplicationContext context = new ClassPathXmlApplicationContext("src/bean1.xml");
    Book bk = context.getBean("book",Book.class);
        System.out.println(bk);
        bk.help();
    }
    @Test
    public void PersonTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("src/bean1.xml");
        PersonService personService = context.getBean("personDao",PersonService.class);
        System.out.println(personService);
        personService.help();
    }

    @Test
    public void myBookTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("src/bean1.xml");
        System.out.println(context.getBean("Book").toString());
    }

    @Test
    public void collectiontest(){
    ApplicationContext context = new ClassPathXmlApplicationContext("src/collection.xml");
    collections cs = context.getBean("stu",collections.class);
    cs.test();
    }
}
