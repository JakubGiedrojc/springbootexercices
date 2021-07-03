package animalstest;

import com.example.springbasics.SpringbasicsApplication;
import com.example.springbasics.animals.Cat;
import com.example.springbasics.animals.Cow;
import com.example.springbasics.animals.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;


public class AnimalTest {

    @Test
    void CatBeanTest() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        //when
        Cat cat = context.getBean(Cat.class);

        //then
        assertThat(cat.voice()).isEqualTo("miau miau");
    }

    @Test
    void CowBeanTest() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        //when
        Cow cow = context.getBean(Cow.class);

        //then
        assertThat(cow.voice()).isEqualTo("Muuu muu");
    }

    @Test
    void DogBeanTest() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        //when
        Dog dog = context.getBean(Dog.class);

        //then
        assertThat(dog.voice()).isEqualTo("Hau hau");
    }
}
