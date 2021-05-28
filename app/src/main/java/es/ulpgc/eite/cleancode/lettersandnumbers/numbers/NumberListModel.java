package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.AlmacenLetrasNumeros;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public class NumberListModel implements NumberListContract.Model {

  public static String TAG = NumberListModel.class.getSimpleName();

  private String data;
  private Long idLetra;
  private int numero;
  private List<AlmacenLetrasNumeros> letras;
  public NumberListModel(String data) {
    this.data = data;
    this.numero=0;
    letras = new ArrayList<>();
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
  public List<NumberData> getLista(Long id) {
    for(int i=0;i<letras.size();i++) {
      if (letras.get(i).id == id) {
        return letras.get(i).data;
      }
    }

    return null;
  }
  @Override
  public boolean existeObjeto(Long id) {
    for(int i=0;i<letras.size();i++) {
      if (letras.get(i).id == id) {
        return true;
      }
    }

    return false;
  }


  @Override
  public int actualizarNumero (int numero) {
    this.numero=numero;
    this.numero++;
    return this.numero;
  }


  @Override
  public void almacernarNumeros(List<NumberData> listaNumeros) {

    AlmacenLetrasNumeros nuevo=new AlmacenLetrasNumeros();
    nuevo.id=idLetra;
    nuevo.data=listaNumeros;
    letras.add(nuevo);


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
