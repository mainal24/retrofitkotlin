package com.mainal.retrofit_kotlin

data class ResponseRick(

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null,

	@field:SerializedName("info")
	val info: Info? = null
) {
	annotation class SerializedName(val value: String)
}

data class Origin(

	@field:ResponseRick.SerializedName("name")
	val name: String? = null,

	@field:ResponseRick.SerializedName("url")
	val url: String? = null
)

data class Location(

	@field:ResponseRick.SerializedName("name")
	val name: String? = null,

	@field:ResponseRick.SerializedName("url")
	val url: String? = null
)

data class Info(

	@field:ResponseRick.SerializedName("next")
	val next: String? = null,

	@field:ResponseRick.SerializedName("pages")
	val pages: Int? = null,

	@field:ResponseRick.SerializedName("prev")
	val prev: Any? = null,

	@field:ResponseRick.SerializedName("count")
	val count: Int? = null
)

data class ResultsItem(

	@field:ResponseRick.SerializedName("image")
	val image: String? = null,

	@field:ResponseRick.SerializedName("gender")
	val gender: String? = null,

	@field:ResponseRick.SerializedName("species")
	val species: String? = null,

	@field:ResponseRick.SerializedName("created")
	val created: String? = null,

	@field:ResponseRick.SerializedName("origin")
	val origin: Origin? = null,

	@field:ResponseRick.SerializedName("name")
	val name: String? = null,

	@field:ResponseRick.SerializedName("location")
	val location: Location? = null,

	@field:ResponseRick.SerializedName("episode")
	val episode: List<String?>? = null,

	@field:ResponseRick.SerializedName("id")
	val id: Int? = null,

	@field:ResponseRick.SerializedName("type")
	val type: String? = null,

	@field:ResponseRick.SerializedName("url")
	val url: String? = null,

	@field:ResponseRick.SerializedName("status")
	val status: String? = null
)