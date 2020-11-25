package com.company;

import java.nio.file.NotDirectoryException;
import java.util.ArrayList;
import java.util.List;

public class FindCommand {
    public List<File> findWithFilters(File directory, List<Filter> filters) {
        if (!directory.isDirectory) {
            try {
                throw new NotDirectoryException(directory.name);
            } catch (NotDirectoryException e) {
                e.printStackTrace();
            }
        }
        List<File> output = new ArrayList<>();
        findWithFilters(directory, filters,output);
        return output;
    }

    private void findWithFilters(File directory, List<Filter> filters, List<File> output) {
        if (directory.children == null) {
            return;
        }
        for (File file: directory.children) {
            if (file.isDirectory) {
                findWithFilters(file, filters, output);
            } else {
                boolean selectFile = true;
                for (Filter filter: filters) {
                    if (!filter.apply(file)) {
                        selectFile = false;
                    }
                }
                if (selectFile) {
                    output.add(file);
                }
            }
        }
    }
}
