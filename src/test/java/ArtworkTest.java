import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setRemoveAssertJRelatedElementsFromStackTrace;

public class ArtworkTest {

    ArtWork artWork;

    @BeforeEach
    public void SetUp(){
        artWork = new ArtWork("Mona Lisa", "Leonardo Da Vinci", 834);
    }

    @Test
    public void canGetTitle(){
        assertThat(artWork.getTitle()).isEqualTo("Mona Lisa");
    }
    @Test
    public void canGetArtist(){
        assertThat(artWork.getArtist()).isEqualTo("Leonardo Da Vinci");
    }
    @Test
    public void canGetPrice(){
        assertThat(artWork.getPrice()).isEqualTo(834);
    }
}
