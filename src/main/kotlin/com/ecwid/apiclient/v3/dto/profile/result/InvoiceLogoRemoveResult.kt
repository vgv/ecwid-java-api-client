package com.ecwid.apiclient.v3.dto.profile.result

import com.ecwid.apiclient.v3.dto.common.ApiResultDTO

data class InvoiceLogoRemoveResult(
	val deleteCount: Int = 0,
	val success: Boolean = false
) : ApiResultDTO
