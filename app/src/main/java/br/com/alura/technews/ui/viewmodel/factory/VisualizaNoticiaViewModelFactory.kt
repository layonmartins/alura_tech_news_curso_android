package br.com.alura.technews.ui.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.ui.viewmodel.FormularioNoticiaViewModel
import br.com.alura.technews.ui.viewmodel.VisualizaNoticiaViewModel

class VisualizaNoticiaViewModelFactory(
    private val noticiaId: Long,
    private val repository: NoticiaRepository
) : ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(p0: Class<T>): T {
        return VisualizaNoticiaViewModel(noticiaId, repository) as T
    }
}