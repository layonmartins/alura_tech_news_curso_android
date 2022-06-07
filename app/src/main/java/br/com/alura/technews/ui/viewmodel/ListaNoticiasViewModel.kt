package br.com.alura.technews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.repository.Resource

class ListaNoticiasViewModel(
    private val repository: NoticiaRepository
) : ViewModel() {

    private val liveData = MutableLiveData<List<Noticia>>()

    init {
        Log.i("layon.f", "criando viewmodel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("layon.f", "destruindo viewmodel")
    }



    fun buscaTodos() : LiveData<Resource<List<Noticia>?>> {
        return repository.buscaTodos()
    }
}