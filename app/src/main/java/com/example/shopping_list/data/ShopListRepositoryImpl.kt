package com.example.shopping_list.data

import com.example.shopping_list.domain.ShopItem
import com.example.shopping_list.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0

    override fun addShopListItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopListItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopListItem(shopItem: ShopItem) {
        val oldElement = getShopListItem(shopItem.id)
        shopList.remove(oldElement)
        addShopListItem(shopItem)
    }

    override fun getShopListItem(shopItemId: Int): ShopItem {
        return shopList.find{
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }
}