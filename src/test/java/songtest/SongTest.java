package songtest;

import com.example.springbasics.SpringbasicsApplication;
import com.example.springbasics.songs.Song;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SongTest {

    @Test
    void songBeanTest() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        //when
        Song song = (Song) context.getBean("track1");

        //then
        assertThat(song.getTitle()).isEqualTo("Ti amo");
    }

    @Test
    void songSingletonScopeTest(){
        //given
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        // when
        Song song = (Song) context.getBean("track1");
        song.setTitle("Test");
        song = (Song) context.getBean("track1");

        //then
        assertThat(song.getTitle()).isEqualTo("Test");
    }
    @Test
    void songPrototypeScopeTest(){
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        //when
        Song song=(Song) context.getBean("track2");
        song.setAuthor("Elvis Presley");
        song= (Song) context.getBean("track2");
        //then
        assertThat(song.getAuthor()).isEqualTo("Metallica");
    }
}
