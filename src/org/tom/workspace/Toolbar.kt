package org.tom.workspace

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.layout.HBox
import javafx.stage.Stage

/**
 * @author Thomas Povinelli
 * *         Created 5/23/17
 * *         In Indexer
 */
class Toolbar(private val owner: Stage) {
    private val buttonBox = HBox()
    private val newButton = Button("New")
    private val openButton = Button("Open")
    private val saveButton = Button("Save")
    private val saveAsButton = Button("Save As")
    private val quitButton = Button("Quit")

    init {
        buttonBox.children.addAll(newButton, openButton, saveButton, saveAsButton, quitButton)
    }

    fun setNewAction(action: EventHandler<ActionEvent>) {
        newButton.onAction = action
    }

    fun setOpenAction(action: EventHandler<ActionEvent>) {
        openButton.onAction = action
    }

    fun setSaveAction(action: EventHandler<ActionEvent>) {
        saveButton.onAction = action
    }

    fun setSaveAsAction(action: EventHandler<ActionEvent>) {
        saveAsButton.onAction = action
    }

    fun setQuitAction(action: EventHandler<ActionEvent>) {
        quitButton.onAction = action
    }

    fun getNewAction(): EventHandler<ActionEvent> {
        return newButton.onAction
    }

    fun getOpenAction(): EventHandler<ActionEvent> {
        return openButton.onAction
    }

    fun getSaveAction(): EventHandler<ActionEvent> {
        return saveButton.onAction
    }

    fun getSaveAsAction(): EventHandler<ActionEvent> {
        return saveAsButton.onAction
    }

    fun getQuitAction(): EventHandler<ActionEvent> {
        return quitButton.onAction
    }
}
