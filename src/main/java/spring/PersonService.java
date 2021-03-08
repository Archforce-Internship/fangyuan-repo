package spring;

public class PersonService {
    private PersonDaoImpl personDao;

    public void setPersonDao(PersonDaoImpl personDao) {
        this.personDao = personDao;
    }

    public void help(){
        personDao.add();
    }
}
