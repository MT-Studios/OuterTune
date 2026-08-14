/*
 * Copyright (C) 2025 OuterTune Project
 *
 * SPDX-License-Identifier: GPL-3.0
 *
 * For any other attributions, refer to the git commit history
 */

package com.dd3boh.outertune.utils.scanners

import android.os.ParcelFileDescriptor
import android.util.Log
import com.dd3boh.outertune.constants.SCANNER_DEBUG
import com.dd3boh.outertune.models.SongTempData
import java.io.File

/**
 * TagLib scanner - temporarily disabled due to missing taglib module
 */
object TagLibScanner : MetadataScanner {
    override suspend fun getAllMetadataFromFile(file: File): SongTempData {
        // Temporarily disabled - TagLib module not available
        Log.w("TagLibScanner", "TagLib scanner is temporarily disabled")
        throw UnsupportedOperationException("TagLib scanner is temporarily disabled")
    }
    
    fun scanFile(
        file: File,
        pfd: ParcelFileDescriptor? = null,
        debug: Boolean = SCANNER_DEBUG
    ): SongTempData? {
        // Temporarily disabled - TagLib module not available
        Log.w("TagLibScanner", "TagLib scanner is temporarily disabled")
        return null
    }
}