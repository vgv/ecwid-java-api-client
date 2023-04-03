package com.ecwid.apiclient.v3.dto.order.enums

@Suppress("unused")
enum class OrderFulfillmentStatus {
	AWAITING_PROCESSING,
	PROCESSING,
	SHIPPED,
	DELIVERED,
	WILL_NOT_DELIVER,
	RETURNED,
	READY_FOR_PICKUP,
	OUT_FOR_DELIVERY,
	CUSTOM_FULFILLMENT_STATUS_1,
	CUSTOM_FULFILLMENT_STATUS_2,
	CUSTOM_FULFILLMENT_STATUS_3;
}
