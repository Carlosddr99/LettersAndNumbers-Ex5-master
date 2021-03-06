package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import android.util.Log;

public class LetterListModel implements LetterListContract.Model {

  public static String TAG = LetterListModel.class.getSimpleName();

  private String data;
  private char letra;

  public LetterListModel(String data) {
    this.data = data;
    letra='A';
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
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
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }
  @Override
  public void actualizarLetra(){

    data=Character.toString(letra);
    letra++;
  }
}
