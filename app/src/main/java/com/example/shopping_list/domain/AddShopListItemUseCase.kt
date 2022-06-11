package com.example.shopping_list.domain

class AddShopListItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopListItem(shopItem: ShopItem){
        shopListRepository.addShopListItem(shopItem)
    }
}