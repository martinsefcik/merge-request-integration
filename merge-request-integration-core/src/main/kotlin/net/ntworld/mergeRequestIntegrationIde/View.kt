package net.ntworld.mergeRequestIntegrationIde

import com.intellij.util.EventDispatcher
import java.util.*

interface View<Action : EventListener> {
    val dispatcher: EventDispatcher<Action>

}