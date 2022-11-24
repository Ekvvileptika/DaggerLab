package az.widget.daggerlab.repository

import javax.inject.Inject

class Repository @Inject constructor(): IRepository {
    override fun getSomeFunction(): String {
        return "Hello world!"
    }
}