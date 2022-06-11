package com.example.shopping_list.domain

class GetShopListItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopListItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopListItem(shopItemId)
    }
}