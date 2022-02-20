package com.task1.service.inter;

import com.task1.exception.*;
import com.task1.entity.*;

public interface ArraySearcher {

    int findMin(CustomArray entity) throws AppException;

    int findMax(CustomArray entity) throws AppException;

}
