package com.mogproject.mogami.playground.view.section

import com.mogproject.mogami.playground.view.parts.common.AccordionMenu
import com.mogproject.mogami.playground.view.parts.language.{MessageLanguageSelector, PieceLanguageSelector, RecordLanguageSelector}

import scalatags.JsDom.all._

/**
  *
  */
object SettingsSection extends Section {
  override def initialize(): Unit = {
    super.initialize()
    MessageLanguageSelector.initialize()
    RecordLanguageSelector.initialize()
    PieceLanguageSelector.initialize()
  }

  override val accordions: Seq[AccordionMenu] = Seq(AccordionMenu(
    "Settings",
    "Settings",
    "wrench",
    false,
    true,
    div(
      MessageLanguageSelector.output,
      RecordLanguageSelector.output,
      PieceLanguageSelector.output
    )
  ))

}
