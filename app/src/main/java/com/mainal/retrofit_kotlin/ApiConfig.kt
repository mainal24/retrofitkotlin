package com.mainal.retrofit_kotlin

object ApiConfig {
    const val baseURL =  "https://rickandmortyapi.com/api/"

    fun getRetrofit(): retrofit{
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    class GsonConverterFactory {
        companion object {
            fun create(): Any {
                TODO("Not yet implemented")
            }
        }

    }

    class Retrofit {
        class Builder {

        }

    }

    class retrofit {
        fun create(java: Class<ApiService>): ApiService {
            TODO("Not yet implemented")
        }

    }

    fun getservice(): ApiService {
        return getRetrofit().create(ApiService::class.java)
    }
}

private fun Any.build(): ApiConfig.retrofit {
    TODO("Not yet implemented")
}

private fun Any.addConverterFactory(create: Any): Any {
    TODO("Not yet implemented")
}

private fun ApiConfig.Retrofit.Builder.baseUrl(baseURL: String): Any {
    TODO("Not yet implemented")
}
