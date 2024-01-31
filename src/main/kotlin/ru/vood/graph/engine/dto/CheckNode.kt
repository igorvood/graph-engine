package ru.vood.graph.engine.dto

interface CheckNode : INode {

    fun check(context: IContext): IError?
}
