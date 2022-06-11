package com.example.shopping_list.domain

class DeleteShopListItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopListItem(shopItem: ShopItem){
        shopListRepository.deleteShopListItem(shopItem)
    }
}