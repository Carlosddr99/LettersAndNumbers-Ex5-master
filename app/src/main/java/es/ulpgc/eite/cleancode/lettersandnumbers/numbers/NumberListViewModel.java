package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.AlmacenLetrasNumeros;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public class NumberListViewModel {

  // put the view state here
  public String data;
  public List<NumberData> datasource;
  public Long idLetra;
  public int numeroActual;
  public List<AlmacenLetrasNumeros> letras;

  public NumberListViewModel() {
    datasource = new ArrayList<>();
    letras=new ArrayList<>();

  }
}

