package com.ecwid.apiclient.v3.rule

import com.ecwid.apiclient.v3.dto.cart.result.FetchedCart
import com.ecwid.apiclient.v3.dto.category.result.FetchedCategory
import com.ecwid.apiclient.v3.dto.coupon.result.FetchedCoupon
import com.ecwid.apiclient.v3.dto.customer.result.FetchedCustomer
import com.ecwid.apiclient.v3.dto.customergroup.result.FetchedCustomerGroup
import com.ecwid.apiclient.v3.dto.instantsite.redirects.result.FetchedInstantSiteRedirect
import com.ecwid.apiclient.v3.dto.order.result.FetchedOrder
import com.ecwid.apiclient.v3.dto.product.result.FetchedProduct
import com.ecwid.apiclient.v3.dto.producttype.result.FetchedProductType
import com.ecwid.apiclient.v3.dto.profile.result.FetchedOrderStatusSettings
import com.ecwid.apiclient.v3.dto.profile.result.FetchedStoreProfile
import com.ecwid.apiclient.v3.dto.variation.result.FetchedVariation
import com.ecwid.apiclient.v3.rule.NonUpdatablePropertyRule.Ignored
import com.ecwid.apiclient.v3.rule.NonUpdatablePropertyRule.ReadOnly
import kotlin.reflect.KProperty1

val nonUpdatablePropertyRules: List<NonUpdatablePropertyRule<*, *>> = listOf(

	ReadOnly(FetchedProduct::id),
	Ignored(FetchedProduct::url),
	Ignored(FetchedProduct::created),
	Ignored(FetchedProduct::createTimestamp),
	Ignored(FetchedProduct::updated),
	Ignored(FetchedProduct::updateTimestamp),
	Ignored(FetchedProduct::inStock),
	Ignored(FetchedProduct::categories),
	Ignored(FetchedProduct::priceInProductList),
	Ignored(FetchedProduct::defaultDisplayedPrice),
	Ignored(FetchedProduct::defaultDisplayedPriceFormatted),
	Ignored(FetchedProduct::compareToPriceDiscount),
	Ignored(FetchedProduct::compareToPriceDiscountFormatted),
	Ignored(FetchedProduct::compareToPriceDiscountPercent),
	Ignored(FetchedProduct::compareToPriceDiscountPercentFormatted),
	Ignored(FetchedProduct::compareToPriceFormatted),
	ReadOnly(FetchedProduct::defaultDisplayedCompareToPrice),
	ReadOnly(FetchedProduct::defaultDisplayedCompareToPriceFormatted),
	ReadOnly(FetchedProduct::defaultDisplayedCompareToPriceDiscount),
	ReadOnly(FetchedProduct::defaultDisplayedCompareToPriceDiscountFormatted),
	ReadOnly(FetchedProduct::defaultDisplayedCompareToPriceDiscountPercent),
	ReadOnly(FetchedProduct::defaultDisplayedCompareToPriceDiscountPercentFormatted),
	Ignored(FetchedProduct::lowestPrice),
	ReadOnly(FetchedProduct::defaultDisplayedLowestPrice),
	ReadOnly(FetchedProduct::defaultDisplayedLowestPriceFormatted),
	Ignored(FetchedProduct.AttributeValue::name),
	Ignored(FetchedProduct.AttributeValue::type),
	Ignored(FetchedProduct.AttributeValue::show),
	Ignored(FetchedProduct.TaxInfo::defaultLocationIncludedTaxRate),
	Ignored(FetchedProduct::originalImage),
	Ignored(FetchedProduct::galleryImages),
	ReadOnly(FetchedProduct::borderInfo),
	Ignored(FetchedProduct.ProductImage::isMain),
	Ignored(FetchedProduct.ProductImage::image160pxUrl),
	Ignored(FetchedProduct.ProductImage::image400pxUrl),
	Ignored(FetchedProduct.ProductImage::image800pxUrl),
	Ignored(FetchedProduct.ProductImage::image1500pxUrl),
	Ignored(FetchedProduct.ProductImage::imageOriginalUrl),
	ReadOnly(FetchedProduct.ProductMedia::videos),
	ReadOnly(FetchedProduct.GalleryImage::borderInfo),
	Ignored(FetchedProduct::files),
	Ignored(FetchedProduct::favorites),
	Ignored(FetchedProduct::defaultCombinationId),
	Ignored(FetchedProduct::combinations),
	Ignored(FetchedProduct::isGiftCard),
	ReadOnly(FetchedProduct::googleProductCategoryName),

	Ignored(FetchedCart::cartId),
	Ignored(FetchedCart::email),
	Ignored(FetchedCart::ipAddress),
	Ignored(FetchedCart::createDate),
	Ignored(FetchedCart::createTimestamp),
	Ignored(FetchedCart::updateDate),
	Ignored(FetchedCart::updateTimestamp),
	Ignored(FetchedCart::refererUrl),
	Ignored(FetchedCart::globalReferer),
	Ignored(FetchedCart::affiliateId),
	Ignored(FetchedCart::additionalInfo),
	Ignored(FetchedCart::orderComments),
	Ignored(FetchedCart::trackingNumber),
	Ignored(FetchedCart::paymentMethod),
	Ignored(FetchedCart::paymentModule),
	Ignored(FetchedCart::paymentParams),
	Ignored(FetchedCart::paymentMessage),
	Ignored(FetchedCart::creditCardStatus),
	Ignored(FetchedCart::externalTransactionId),
	Ignored(FetchedCart::recoveredOrderId),
	Ignored(FetchedCart::recoveredPublicUid),
	Ignored(FetchedCart::recoveryEmailSentTimestamp),
	Ignored(FetchedCart::customerId),
	Ignored(FetchedCart::customerGroupId),
	Ignored(FetchedCart::customerGroup),
	Ignored(FetchedCart::total),
	Ignored(FetchedCart::subtotal),
	Ignored(FetchedCart::usdTotal),
	Ignored(FetchedCart::tax),
	Ignored(FetchedCart::customerTaxExempt),
	Ignored(FetchedCart::customerTaxId),
	Ignored(FetchedCart::customerTaxIdValid),
	Ignored(FetchedCart::reversedTaxApplied),
	Ignored(FetchedCart::couponDiscount),
	Ignored(FetchedCart::volumeDiscount),
	Ignored(FetchedCart::membershipBasedDiscount),
	Ignored(FetchedCart::totalAndMembershipBasedDiscount),
	Ignored(FetchedCart::discount),
	Ignored(FetchedCart::discountInfo),
	Ignored(FetchedCart::discountCoupon),
	Ignored(FetchedCart::items),
	Ignored(FetchedCart::billingPerson),
	Ignored(FetchedCart::shippingPerson),
	Ignored(FetchedCart::shippingOption),
	Ignored(FetchedCart::handlingFee),
	Ignored(FetchedCart::utmData),
	Ignored(FetchedCart::acceptMarketing),

	ReadOnly(FetchedCategory::id),
	Ignored(FetchedCategory::hdThumbnailUrl),
	Ignored(FetchedCategory::thumbnailUrl),
	Ignored(FetchedCategory::imageUrl),
	Ignored(FetchedCategory::originalImageUrl),
	Ignored(FetchedCategory::originalImage),
	Ignored(FetchedCategory::url),
	Ignored(FetchedCategory::productCount),
	ReadOnly(FetchedCategory::productCountWithoutSubcategories),
	Ignored(FetchedCategory::enabledProductCount),

	ReadOnly(FetchedCoupon::id),
	Ignored(FetchedCoupon::creationDate),
	Ignored(FetchedCoupon::updateDate),

	ReadOnly(FetchedCustomer::id),
	Ignored(FetchedCustomer::registered),
	Ignored(FetchedCustomer::updated),
	Ignored(FetchedCustomer::customerGroupName),
	Ignored(FetchedCustomer.BillingPerson::firstName),
	Ignored(FetchedCustomer.BillingPerson::lastName),
	Ignored(FetchedCustomer.BillingPerson::countryName),
	Ignored(FetchedCustomer.BillingPerson::stateOrProvinceName),
	Ignored(FetchedCustomer.ShippingAddress::countryName),
	Ignored(FetchedCustomer.ShippingAddress::stateOrProvinceName),
	ReadOnly(FetchedCustomer.ShippingAddress::createdDate),
	ReadOnly(FetchedCustomer::stats),
	ReadOnly(FetchedCustomer::contacts),

	ReadOnly(FetchedCustomerGroup::id),

	ReadOnly(FetchedOrder::id),
	ReadOnly(FetchedOrder::internalId),
	ReadOnly(FetchedOrder::orderNumber),
	ReadOnly(FetchedOrder::vendorOrderNumber),
	ReadOnly(FetchedOrder::publicUid),
	ReadOnly(FetchedOrder::orderExtraFields),
	ReadOnly(FetchedOrder::giftCardCode),
	ReadOnly(FetchedOrder::giftCardDoubleSpending),
	ReadOnly(FetchedOrder::giftCardId),
	ReadOnly(FetchedOrder::giftCardRedemption),
	ReadOnly(FetchedOrder::totalBeforeGiftCardRedemption),
	ReadOnly(FetchedOrder::totalWithoutTax),
	ReadOnly(FetchedOrder::subtotalWithoutTax),
	ReadOnly(FetchedOrder::availableTaxes),
	ReadOnly(FetchedOrder::availableShippingOptions),
	ReadOnly(FetchedOrder::shipments),
	ReadOnly(FetchedOrder::invoices),
	ReadOnly(FetchedOrder::predictedPackage),
	ReadOnly(FetchedOrder::customerGroupId),
	ReadOnly(FetchedOrder::ticket),
	ReadOnly(FetchedOrder::paymentSubtype),
	Ignored(FetchedOrder::createTimestamp),
	Ignored(FetchedOrder::updateDate),
	Ignored(FetchedOrder::updateTimestamp),
	Ignored(FetchedOrder::extraFields),
	Ignored(FetchedOrder::usdTotal),
	Ignored(FetchedOrder.DiscountCouponInfo::id),
	Ignored(FetchedOrder.DiscountCouponInfo::creationDate),
	Ignored(FetchedOrder.DiscountCouponInfo::updateDate),
	Ignored(FetchedOrder.DiscountCouponInfo::orderCount),
	Ignored(FetchedOrder.DiscountCouponInfo::catalogLimit),
	Ignored(FetchedOrder.DiscountCouponInfo::applicationLimit),
	ReadOnly(FetchedOrder.BaseOrderItemTax::includeInPrice),
	ReadOnly(FetchedOrder.HandlingFeeTax::includeInPrice),
	Ignored(FetchedOrder.OrderItem::id),
	ReadOnly(FetchedOrder.OrderItem::priceWithoutTax),
	ReadOnly(FetchedOrder.OrderItem::files),
	ReadOnly(FetchedOrder.OrderItem::attributes),
	Ignored(FetchedOrder.OrderItem::imageUrl),
	Ignored(FetchedOrder.OrderItem::smallThumbnailUrl),
	Ignored(FetchedOrder.OrderItem::hdThumbnailUrl),
	Ignored(FetchedOrder.OrderItem::productAvailable),
	Ignored(FetchedOrder.OrderItem::recurringChargeSettings),
	Ignored(FetchedOrder.OrderItem::subscriptionId),
	Ignored(FetchedOrder.OrderItemSelectedOption::files),
	Ignored(FetchedOrder.PersonInfo::firstName),
	Ignored(FetchedOrder.PersonInfo::lastName),
	Ignored(FetchedOrder.PersonInfo::countryName),
	Ignored(FetchedOrder.PersonInfo::stateOrProvinceName),
	Ignored(FetchedOrder.PersonInfo::firstName),
	Ignored(FetchedOrder.PersonInfo::lastName),
	Ignored(FetchedOrder.PersonInfo::countryName),
	Ignored(FetchedOrder.PersonInfo::stateOrProvinceName),
	ReadOnly(FetchedOrder.ShippingOption::shippingRateWithoutTax),
	ReadOnly(FetchedOrder.ShippingOption::localizedLabel),
	ReadOnly(FetchedOrder.ShippingOption::isShippingLimit),
	ReadOnly(FetchedOrder.HandlingFee::valueWithoutTax),
	ReadOnly(FetchedOrder.Surcharge::totalWithoutTax),
	Ignored(FetchedOrder::refundedAmount),
	Ignored(FetchedOrder::refunds),
	ReadOnly(FetchedOrder.OrderItemTax::sourceTaxRateId),
	ReadOnly(FetchedOrder.OrderItemTax::sourceTaxRateType),
	ReadOnly(FetchedOrder::shippingLabelAvailableForShipment),

	ReadOnly(FetchedProductType::id),
	Ignored(FetchedProductType::googleTaxonomy),

	Ignored(FetchedStoreProfile.GeneralInfo::storeId),
	Ignored(FetchedStoreProfile.InstantSiteInfo::generatedUrl),
	Ignored(FetchedStoreProfile.InstantSiteInfo::storeLogoUrl),
	Ignored(FetchedStoreProfile.Account::availableFeatures),
	Ignored(FetchedStoreProfile.Account::whiteLabel),
	ReadOnly(FetchedStoreProfile.Account::brandName),
	ReadOnly(FetchedStoreProfile.Account::supportEmail),
	ReadOnly(FetchedStoreProfile.Account::registrationDate),
	ReadOnly(FetchedStoreProfile.RegistrationAnswers::facebook),
	ReadOnly(FetchedStoreProfile.RegistrationAnswers::alreadySelling),
	ReadOnly(FetchedStoreProfile.RegistrationAnswers::forSomeone),
	ReadOnly(FetchedStoreProfile.RegistrationAnswers::goods),
	ReadOnly(FetchedStoreProfile.RegistrationAnswers::otherGoods),
	ReadOnly(FetchedStoreProfile.RegistrationAnswers::platform),
	ReadOnly(FetchedStoreProfile::registrationAnswers),
	Ignored(FetchedStoreProfile.Settings::invoiceLogoUrl),
	Ignored(FetchedStoreProfile.Settings::emailLogoUrl),
	Ignored(FetchedStoreProfile.FormatsAndUnits::currencyPrecision),
	Ignored(FetchedStoreProfile.Languages::facebookPreferredLocale),
	Ignored(FetchedStoreProfile.Shipping::shippingOrigin),
	Ignored(FetchedStoreProfile.Shipping::shippingOptions),
	Ignored(FetchedStoreProfile::payment),
	Ignored(FetchedStoreProfile::featureToggles),
	Ignored(FetchedStoreProfile::designSettings),
	Ignored(FetchedStoreProfile::fbMessengerSettings),
	Ignored(FetchedStoreProfile::giftCardSettings),
	ReadOnly(FetchedStoreProfile.Settings::googleProductCategoryName),
	ReadOnly(FetchedStoreProfile.TikTokPixelSettings::code),
	ReadOnly(FetchedStoreProfile.InstantSiteInfo::ecwidSubdomainSuffix),
	ReadOnly(FetchedStoreProfile.PaymentOptionInfo::id),
	ReadOnly(FetchedStoreProfile.PaymentOptionInfo::paymentProcessorTitle),

	ReadOnly(FetchedVariation::id),
	Ignored(FetchedVariation::combinationNumber),
	Ignored(FetchedVariation.Option::nameTranslated),
	Ignored(FetchedVariation.Option::valueTranslated),
	Ignored(FetchedVariation::smallThumbnailUrl),
	Ignored(FetchedVariation::hdThumbnailUrl),
	Ignored(FetchedVariation::thumbnailUrl),
	Ignored(FetchedVariation::imageUrl),
	Ignored(FetchedVariation::originalImageUrl),
	Ignored(FetchedVariation::defaultDisplayedPrice),
	Ignored(FetchedVariation::defaultDisplayedPriceFormatted),
	ReadOnly(FetchedVariation::inStock),
	Ignored(FetchedVariation::borderInfo),
	Ignored(FetchedVariation::lowestPrice),
	ReadOnly(FetchedVariation::defaultDisplayedLowestPrice),
	ReadOnly(FetchedVariation::defaultDisplayedLowestPriceFormatted),
	Ignored(FetchedVariation.AttributeValue::name),
	Ignored(FetchedVariation.AttributeValue::type),
	Ignored(FetchedVariation.AttributeValue::show),
	ReadOnly(FetchedVariation.RecurringChargeSettings::subscriptionPriceWithSignUpFeeFormatted),
	ReadOnly(FetchedVariation.RecurringChargeSettings::signUpFee),
	ReadOnly(FetchedVariation.RecurringChargeSettings::signUpFeeFormatted),
	ReadOnly(FetchedVariation.RecurringChargeSettings::subscriptionPriceWithSignUpFeeFormatted),
	ReadOnly(FetchedVariation.SubscriptionSettings::oneTimePurchasePriceFormatted),
	ReadOnly(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkupFormatted),
	ReadOnly(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkup),
	ReadOnly(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkupPercent),
	ReadOnly(FetchedVariation.SubscriptionSettings::oneTimePurchaseMarkupPercentFormatted),
	ReadOnly(FetchedVariation.SubscriptionSettings::displayedOneTimePurchaseMarkupPercent),
	ReadOnly(FetchedVariation.SubscriptionSettings::displayedOneTimePurchaseMarkupPercentFormatted),

	ReadOnly(FetchedProduct.RecurringChargeSettings::subscriptionPriceWithSignUpFeeFormatted),
	ReadOnly(FetchedProduct.RecurringChargeSettings::signUpFee),
	ReadOnly(FetchedProduct.RecurringChargeSettings::signUpFeeFormatted),
	ReadOnly(FetchedProduct.RecurringChargeSettings::subscriptionPriceWithSignUpFeeFormatted),
	ReadOnly(FetchedProduct.SubscriptionSettings::oneTimePurchasePriceFormatted),
	ReadOnly(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkupFormatted),
	ReadOnly(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkup),
	ReadOnly(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkupPercent),
	ReadOnly(FetchedProduct.SubscriptionSettings::oneTimePurchaseMarkupPercentFormatted),
	ReadOnly(FetchedProduct.SubscriptionSettings::displayedOneTimePurchaseMarkupPercent),
	ReadOnly(FetchedProduct.SubscriptionSettings::displayedOneTimePurchaseMarkupPercentFormatted),

	ReadOnly(FetchedOrderStatusSettings::statusId),
	ReadOnly(FetchedOrderStatusSettings::orderStatusType),
	ReadOnly(FetchedOrderStatusSettings::defaultStatus),
	ReadOnly(FetchedOrderStatusSettings::lastNameChangeDate),

	ReadOnly(FetchedInstantSiteRedirect::id),
)

sealed class NonUpdatablePropertyRule<T, R>(
	val property: KProperty1<T, R>
) {

	class ReadOnly<T, R> internal constructor(
		property: KProperty1<T, R>
	) : NonUpdatablePropertyRule<T, R>(property)

	class Ignored<T, R> internal constructor(
		property: KProperty1<T, R>
	) : NonUpdatablePropertyRule<T, R>(property)
}
