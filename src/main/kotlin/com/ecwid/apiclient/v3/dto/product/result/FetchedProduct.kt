package com.ecwid.apiclient.v3.dto.product.result

import com.ecwid.apiclient.v3.dto.product.enums.*
import java.util.*

data class FetchedProduct(
		val id: Int = 0,
		val name: String = "",
		val description: String? = null,
		val sku: String? = null,
		val isSampleProduct: Boolean? = null, // TODO Figure out how to test
		val url: String? = null,

		val created: Date = Date(),
		val createTimestamp: Int = 0,
		val updated: Date = Date(),
		val updateTimestamp: Int = 0,

		val enabled: Boolean? = null,
		val quantity: Int? = null,
		val unlimited: Boolean? = null,
		val inStock: Boolean? = null, // TODO Figure out how to test
		val warningLimit: Int? = null,

		val categoryIds: List<Int>? = null,
		val categories: List<CategoryInfo>? = null, // TODO Figure out how to test
		val defaultCategoryId: Int? = null,
		val showOnFrontpage: Int? = null,

		val price: Double? = null,
		val priceInProductList: Double? = null, // TODO Figure out how to test
		val defaultDisplayedPrice: Double? = null, // TODO Figure out how to test
		val defaultDisplayedPriceFormatted: String? = null, // TODO Figure out how to test
		val wholesalePrices: List<WholesalePrice>? = null,

		val compareToPrice: Double? = null,
		val compareToPriceDiscount: Double? = null, // TODO Figure out how to test
		val compareToPriceDiscountFormatted: String? = null, // TODO Figure out how to test
		val compareToPriceDiscountPercent: Double? = null, // TODO Figure out how to test
		val compareToPriceDiscountPercentFormatted: String? = null, // TODO Figure out how to test
		val compareToPriceFormatted: String? = null, // TODO Figure out how to test

		val weight: Double? = null,
		val dimensions: ProductDimensions? = null,
		val shipping: ShippingSettings? = null,
		val isShippingRequired: Boolean? = null,

		val productClassId: Int? = null,
		val attributes: List<AttributeValue>? = null,

		val seoTitle: String? = null,
		val seoDescription: String? = null,

		val options: List<ProductOption>? = null,
		val tax: TaxInfo? = null,
		val relatedProducts: RelatedProducts? = null,

		val galleryImages: List<GalleryImage>? = null,
		val media: ProductMedia? = null,
		val files: List<ProductFile>? = null,
		val favorites: FavoritesStats? = null // TODO Figure out how to test

		// val defaultCombinationId: Int? = null // TODO implement combinations support
		// val combinations: List<Combination>? = null // TODO implement combinations support
) {

	data class WholesalePrice(
			val quantity: Int = 0,
			val price: Double = 0.0
	)

	data class CategoryInfo(
			val id: Int = 0,
			val enabled: Boolean = true
	)

	data class TaxInfo(
			val defaultLocationIncludedTaxRate: Double = 0.0,
			val enabledManualTaxes: List<Int> = listOf()
	)

	data class ProductOption(
			val type: ProductOptionType? = null,
			val name: String? = null,
			val choices: List<ProductOptionChoice>? = null,
			val defaultChoice: Int? = null,
			val required: Boolean? = null
	)

	data class ProductOptionChoice(
			val text: String = "",
			val priceModifier: Double = 0.0,
			val priceModifierType: PriceModifierType = PriceModifierType.ABSOLUTE
	)

	data class ShippingSettings(
			val type: ShippingSettingsType? = null,
			val methodMarkup: Double? = null,
			val flatRate: Double? = null,
			val disabledMethods: List<String>? = null,
			val enabledMethods: List<String>? = null
	)

	data class AttributeValue(
			val id: Int? = null,
			val alias: AttributeValueAlias? = null,
			val value: String? = null,
			val show: AttributeValueLocation? = null
	)

	data class RelatedProducts(
			val productIds: List<Int>? = null,
			val relatedCategory: RelatedCategory? = null
	)

	data class RelatedCategory(
			val enabled: Boolean? = null,
			val categoryId: Int? = null,
			val productCount: Int? = null
	)

	data class ProductDimensions(
			val length: Double? = null,
			val width: Double? = null,
			val height: Double? = null
	)

	data class GalleryImage(
			val id: Int = 0,
			val orderBy: Int = 0,
			val alt: String? = null,
			val width: Int = 0,
			val height: Int = 0,
			val url: String = "",
			val thumbnail: String? = null,
			val originalImageUrl: String = "",
			val imageUrl: String = "",
			val hdThumbnailUrl: String = "",
			val thumbnailUrl: String = "",
			val smallThumbnailUrl: String = ""
	)

	data class ProductMedia(
			val images: List<ProductImage> = listOf()
	)

	data class ProductImage(
			val id: String = "0",
			val orderBy: Int = 0,
			val isMain: Boolean = false,
			val image160pxUrl: String? = null,
			val image400pxUrl: String? = null,
			val image800pxUrl: String? = null,
			val image1500pxUrl: String? = null,
			val imageOriginalUrl: String? = null
	)

	data class ProductFile(
			val id: Int = 0,
			val name: String = "",
			val description: String = "",
			val size: Long = 0,
			val adminUrl: String = ""
	)

	data class FavoritesStats(
			val count: Int? = null,
			val displayedCount: String? = null
	)

}