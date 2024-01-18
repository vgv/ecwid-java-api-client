package com.ecwid.apiclient.v3.dto.report.enums

enum class ReportType {
	/** visitors */
	allTraffic,
	newVsReturningVisitors,
	visitorsByDevice,
	visitorsByCountry,

	/** orders */
	allOrders,
	newOrdersVsRepeatOrders,

	/** finance */
	allRevenue,
	allExpenses,
	allProfit,

	/** marketing */
	customersByMarketingEmailsConsent,
	topOfMarketingSources,

	/** conversions */
	conversions,
	addToCartConversion,

}
