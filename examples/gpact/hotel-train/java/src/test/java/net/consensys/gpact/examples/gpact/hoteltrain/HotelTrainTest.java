package net.consensys.gpact.examples.gpact.hoteltrain;

import net.consensys.gpact.helpers.AbstractExampleTest;
import org.junit.jupiter.api.Test;

public class HotelTrainTest extends AbstractExampleTest {

  //  @Test
  //  public void directSignSerialSingleBlockchain() throws Exception {
  //    String tempPropsFile = createPropertiesFile(true, true, true);
  //    Main.main(new String[]{tempPropsFile});
  //  }

  @Test
  public void directSignSerialMultiBlockchain() throws Exception {
    String tempPropsFile = createPropertiesFile(true, true, false);
    HotelTrain.main(new String[] {tempPropsFile});
  }

  @Test
  public void transferSerialMultiBlockchain() throws Exception {
    String tempPropsFile = createPropertiesFile(false, true, false);
    HotelTrain.main(new String[] {tempPropsFile});
  }

  @Test
  public void directParallelMultiBlockchain() throws Exception {
    String tempPropsFile = createPropertiesFile(true, false, false);
    HotelTrain.main(new String[] {tempPropsFile});
  }
}
