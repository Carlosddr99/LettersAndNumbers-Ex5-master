package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.app.LettersToNumbersState;
import es.ulpgc.eite.cleancode.lettersandnumbers.app.NumbersToLettersState;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.AlmacenLetrasNumeros;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public interface NumberListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(NumberListViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onClickNumberListCell(NumberData data);
    void onClickNumberListButton();
  }

  interface Model {
    String getStoredData();
    Long getId();
    List<NumberData> getLista(Long id);
    boolean existeObjeto(Long id);
    int actualizarNumero(int numero);
    void almacernarNumeros(List<NumberData> listaNumeros);
    void onDataFromNextScreen(String data);
    void onRestartScreen(String data);
    void onDataFromPreviousScreen(Long idLetra);
  }


}
