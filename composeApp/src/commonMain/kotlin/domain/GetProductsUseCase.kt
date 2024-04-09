package domain

import data.repo.HomeRepository

class GetProductsUseCase(
    private val homeRepository: HomeRepository
) {
//    suspend operator fun invoke() =
//        homeRepository.getAllProducts()

}