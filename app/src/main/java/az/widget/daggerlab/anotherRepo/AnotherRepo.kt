package az.widget.daggerlab.anotherRepo

import javax.inject.Inject


class AnotherRepo @Inject constructor(): IAnotherRepo {
    override fun getFloat(): Float {
        return 0.10f
    }
}