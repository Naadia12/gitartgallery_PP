import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    @BeforeEach

    Gallery gallery;

    public void SetUp(){

        gallery = new Gallery ("Louvre");

    }

}
