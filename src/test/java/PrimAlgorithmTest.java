import org.junit.Test;

import java.io.File;
import java.io.InputStream;


public class PrimAlgorithmTest {
    @Test
    public void 임시로돌려봄(){
//        final InputStream stream = this.getClass().getResourceAsStream("/filename.txt");

        PrimAlgorithm g = new PrimAlgorithm("src/main/resources/graph.txt"); //그래프 g 생성
        g.prim(0);
    }
}
