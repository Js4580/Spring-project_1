package kg.nazi_4580.util;

import kg.nazi_4580.dao.PersonDAO;
import kg.nazi_4580.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {
    private final PersonDAO personDAO;

    @Autowired

    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        if (personDAO.trueOrFalsePersonIsPresent(person.getFull_name()).isPresent())
            errors.rejectValue("full_name","","Такое имя уже существует - прошу вас ввести другое имя");
    }
}

