package org.simol.examples.design_patterns.composite.improvements;class File implements FileSystemComponent{private String name;public File(String name){this.name=name;}public void done(){this.display();}private void display(){System.out.println("File: "+name);}}