package domain

import data.repo.product.ProductRepository

class GetProductsUseCase(
    private val homeRepository: ProductRepository
) {
    suspend operator fun invoke() = homeRepository.getAllProducts()

}