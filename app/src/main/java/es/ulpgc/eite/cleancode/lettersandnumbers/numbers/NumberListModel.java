package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

public class NumberListModel implements NumberListContract.Model {

  public static String TAG = NumberListModel.class.getSimpleName();

  private String data;
  private Long idLetra;
  private int numero;

  public NumberListModel(String data) {
    this.data = data;
    this.numero=0;
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public Long getId() {
    return idLetra;
  }

  @Override
  public int actualizarNumero (int numero) {
    this.numero=numero;
    this.numero++;
    return this.numero;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }

  @Override
  public void onDataFromPreviousScreen(Long idLetra) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
    this.idLetra=idLetra;
  }
}
