package org.allen.sample.designpattern.template;

/**
 * 定义一个算法中的操作框架，而将一些步骤延迟到子类中。使得子类可以不改变算法的结构即可重定义该算法的某些特定步骤。
 * 封装不变部分，扩展可变部分。把认为不变部分的算法封装到父类中实现，而可变部分的则可以通过继承来继续扩展。
 */