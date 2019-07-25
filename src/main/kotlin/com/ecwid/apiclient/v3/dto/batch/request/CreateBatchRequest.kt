package com.ecwid.apiclient.v3.dto.batch.request

import com.ecwid.apiclient.v3.dto.ApiRequest
import com.ecwid.apiclient.v3.httptransport.HttpBody
import com.ecwid.apiclient.v3.impl.RequestInfo

data class CreateBatchRequest(
		val requests: Map<String, ApiRequest>
) : ApiRequest {

	override fun toRequestInfo() = RequestInfo.createPostRequest(
			endpoint = "batch",
			httpBody = HttpBody.JsonBody(
					obj = requests.map { (id, request) ->
						SingleBatchRequest.create(id, request)
					}
			)
	)
}

@Suppress("unused")
private class SingleBatchRequest private constructor(
		val id: String?,
		val path: String,
		val method: String,
		val body: Any?
) {

	companion object {
		internal fun create(id: String, apiRequest: ApiRequest): SingleBatchRequest {
			val requestInfo = apiRequest.toRequestInfo()
			return SingleBatchRequest(
					id = id,
					method = requestInfo.method.name,
					path = requestInfo.endpoint,
					body = when (requestInfo.httpBody) {
						is HttpBody.EmptyBody -> null
						is HttpBody.JsonBody -> requestInfo.httpBody.obj
						is HttpBody.ByteArrayBody -> throw IllegalStateException("Request type ${HttpBody.ByteArrayBody::class.java.simpleName} is not allowed in batch requests")
						is HttpBody.InputStreamBody -> throw IllegalStateException("Request type ${HttpBody.InputStreamBody::class.java.simpleName} is not allowed in batch requests")
						is HttpBody.LocalFileBody -> throw IllegalStateException("Request type ${HttpBody.LocalFileBody::class.java.simpleName} is not allowed in batch requests")
					}
			)
		}
	}

}
