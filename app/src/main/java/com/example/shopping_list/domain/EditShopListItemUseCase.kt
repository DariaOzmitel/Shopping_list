package com.example.shopping_list.domain

class EditShopListItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopListItem(shopItem: ShopItem){
        shopListRepository.editShopListItem(shopItem)
    }
}