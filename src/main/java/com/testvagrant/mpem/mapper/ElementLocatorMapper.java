package com.testvagrant.mpem.mapper;

import org.openqa.selenium.support.FindBy;

public class ElementLocatorMapper {

    private ElementsFileFinder elementsFileFinder;

    public ElementLocatorMapper() {
        this.elementsFileFinder = new ElementsFileFinder();
    }

    public <T> T map(T obj) {
        T element_obj = elementsFileFinder.getElementLocatorsSwapObj(obj);
        return swapLocators(obj, element_obj);
    }

    private <T> T swapLocators(T obj1, T obj2) {
        AnnotationMapper annotationMapper = new AnnotationMapper(FindBy.class);
        return annotationMapper.map(obj1, obj2);
    }
}
