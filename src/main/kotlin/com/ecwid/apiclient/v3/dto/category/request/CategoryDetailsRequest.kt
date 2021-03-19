package com.ecwid.apiclient.v3.dto.category.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.impl.RequestInfo

data class CategoryDetailsRequest(
		val categoryId: Int = 0,
		val baseUrl: String? = null,
		val cleanUrls: Boolean? = null,
		val lang: String? = null
) : ApiRequest {
	override fun toRequestInfo() = RequestInfo.createGetRequest(
			pathSegments = listOf(
				"categories",
				"$categoryId"
			),
			params = toParams()
	)

	private fun toParams(): Map<String, String> {
		val request = this
		return mutableMapOf<String, String>().apply {
			request.baseUrl?.let { put("baseUrl", it) }
			request.cleanUrls?.let { put("cleanUrls", it.toString()) }
			request.lang?.let { put("lang", it) }
		}.toMap()
	}
}
