package com.example.practos2

import kotlin.random.Random

object Models {

    private var listModels: List<OneModel> = emptyList()

    fun getList(): List<OneModel> {
        return listOf(
            OneModel(
                name = "мемы о работе и продуктивности",
                description = "Работать или не работать — вот в чём мем",
                imgList = listOf(
                    "https://i.pinimg.com/736x/9e/ed/54/9eed541d2e12df4323be221e98fd8c92.jpg",
                    "https://i.pinimg.com/736x/65/0d/89/650d89a9744c44cee601bb34cff9cd64.jpg",
                    "https://i.pinimg.com/736x/4a/d9/91/4ad9910e0d3660dc41536f7d77dd9fd7.jpg"
                )),
            OneModel(
                name = "рыбьи мемы",
                description = "смешные рыбы делают что хотят — и вам тоже можно",
                imgList = listOf(
                    "https://i.pinimg.com/1200x/a1/fb/2a/a1fb2a8420a597caaa3c1c105c540330.jpg",
                    "https://i.pinimg.com/736x/9a/ef/47/9aef47fb45dd671e1102b81b5586c0d7.jpg",
                    "https://i.pinimg.com/736x/18/16/b5/1816b5ea616fd3f7c1549aecabb2cc45.jpg"
                )),
            OneModel(
                name = "учёба — боль",
                description = "мозг уже не различает буквы, но мемы — всегда понятны",
                imgList = listOf(
                    "https://i.pinimg.com/736x/3f/c3/08/3fc308bf3ca22b06191d05e16079be52.jpg",
                    "https://i.pinimg.com/736x/cf/14/43/cf1443f49578c15fe61e798ce0fa8165.jpg",
                )),
            OneModel(
                name = "котики против",
                description = "сохранить котика → сохранить рассудок",
                imgList = listOf(
                    "https://i.pinimg.com/1200x/3d/21/8d/3d218d5fbcbe067971033cb4eb8cf26f.jpg",
                    "https://i.pinimg.com/1200x/10/71/d1/1071d17facd2e12ac5f3baf7da3964f9.jpg",
                )),
            OneModel(
                name = "язык будущего (или просто усталости)",
                description = "Сохранить. Отправить. Не объяснять.",
                imgList = listOf(
                    "https://i.pinimg.com/736x/60/a4/ee/60a4ee253feb939e0b4268378d9f564b.jpg",
                    "https://i.pinimg.com/1200x/eb/0e/78/eb0e780ecd23f5c644d88571411d27b2.jpg",
                )),
            OneModel(
                name = "хаотично, но со смыслом (наверное)",
                description = "если в вашей галерее есть всё это одновременно — вы либо гений, либо просто очень устали.",
                imgList = listOf(
                    "https://i.pinimg.com/736x/9c/10/90/9c10907de3047ea026b1ed83a6086603.jpg",
                    "https://i.pinimg.com/736x/a4/6e/a4/a46ea4263d14cc42fd3a114968282689.jpg",
                    "https://i.pinimg.com/736x/bb/4d/f5/bb4df5bfb2203b381db668e9fcabe7ff.jpg"
                )),
            OneModel(
                name = "проблема не найдена? СОЗДАЁМ",
                description = "...потому что жить без проблем — скучно.",
                imgList = listOf(
                    "https://i.pinimg.com/736x/64/a2/09/64a209158637042b8a9a171b857b8069.jpg",
                    "https://i.pinimg.com/736x/c3/e8/4c/c3e84c58ebd13935442913890363b405.jpg",
                    "https://i.pinimg.com/736x/cb/b2/a6/cbb2a69c5c6abafcbe1141b167172305.jpg"
                )),
            OneModel(
                name = "хроники недосыпа",
                description = "05:30. 2 кофе. 0 завтраков. 1 вопрос: зачем я так живу?",
                imgList = listOf(
                    "https://i.pinimg.com/736x/48/c5/6a/48c56a9d039a68e3eb5b5da077bd406a.jpg",
                    "https://i.pinimg.com/1200x/5a/41/73/5a4173f41935da05a01d65587c3fc977.jpg",
                    "https://i.pinimg.com/736x/18/95/b6/1895b693daa0f30554c141993e7c081e.jpg"
                )),
        )
    }

    fun generateListModels(numb: Int) {
        listModels = getList().shuffled().take(numb)
    }
    fun returnList(): List<OneModel> {
        return listModels
    }

}