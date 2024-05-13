import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void SetUp(){

        gallery = new Gallery ("Louvre");

    }

    @Test
    public void getName(){
        assertThat(gallery.getName()).isEqualTo("Louvre");

    }



}
