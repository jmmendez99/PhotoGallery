package api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=bf58752a7c10fa7d24af228022fb9208" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<String>
}