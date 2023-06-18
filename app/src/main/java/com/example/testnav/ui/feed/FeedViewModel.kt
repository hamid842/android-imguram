package com.example.testnav.ui.feed

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.libimgur.entities.GalleryResponse
import com.example.libimgur.entities.Image
import com.example.testnav.data.ImgurRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FeedViewModel : ViewModel() {
    private val repo = ImgurRepository()
    private val _feed = MutableLiveData<GalleryResponse>()

    val feed: MutableLiveData<GalleryResponse> = _feed

    fun updateFeeds(feedType: String) {
        viewModelScope.launch(Dispatchers.IO) {

            when (feedType) {
                "hot" -> _feed.postValue(repo.getHotFeeds())
                "top" -> _feed.postValue(repo.getTopFeeds())
                else -> Log.e("FEED", "Feed should be top or hot")
            }
        }
    }
}
