enum class ColorType {
    красный {
        override fun getColor() = "128, 0, 0";
    },
    синий {
        override fun getColor() = "65, 105, 225";
    },
    зеленый {
        override fun getColor() = "0, 128, 0";
    },
    розовый {
        override fun getColor() = "255, 105, 80";
    };

    abstract fun getColor(): String;
}