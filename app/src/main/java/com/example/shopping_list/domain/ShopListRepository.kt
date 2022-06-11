package com.example.shopping_list.domain

interface ShopListRepository {
    fun addShopListItem(shopItem: ShopItem)

    fun deleteShopListItem(shopItem: ShopItem)

    fun editShopListItem(shopItem: ShopItem)

    fun getShopListItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}