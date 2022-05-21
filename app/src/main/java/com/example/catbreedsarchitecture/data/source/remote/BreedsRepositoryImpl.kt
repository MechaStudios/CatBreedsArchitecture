package com.example.catbreedsarchitecture.data.source.remote

import com.example.catbreedsarchitecture.api.ApiService
import javax.inject.Inject

    class BreedsRepositoryImpl @Inject constructor (private val breedsRemoteDataSource: BreedsRemoteDataSource) : BreedsRepository {

    //fun getBreeds(searchText : String,id : String) = retrofitService.getBreeds(searchText,id)
    // fun getDefaultBreeds() = retrofitService.getDefaultBreeds()
    override suspend fun getDefaultBreeds() = breedsRemoteDataSource.getDefaultBreeds()


}